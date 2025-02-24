document.addEventListener("DOMContentLoaded", function () {
    const coursesContainer = document.getElementById("courses-container");
    const searchBar = document.createElement("input");

    searchBar.setAttribute("type", "text");
    searchBar.setAttribute("id", "searchBar");
    searchBar.setAttribute("placeholder", "Search courses...");
    searchBar.addEventListener("input", filterCourses);

    coursesContainer.before(searchBar);

    // Fetch courses from JSON file
    fetch("courses.json")
        .then(response => response.json())
        .then(data => {
            displayCourses(data);
        })
        .catch(error => console.error("Error loading courses:", error));

    function displayCourses(courses) {
        coursesContainer.innerHTML = "";
        courses.forEach(course => {
            const courseCard = document.createElement("div");
            courseCard.classList.add("course-card");

            courseCard.innerHTML = `
                <h2>${course.title}</h2>
                <p><strong>Description:</strong> ${course.description}</p>
                <p><strong>Prerequisites:</strong> ${course.prerequisites.join(", ")}</p>
                <h3>User Reviews:</h3>
                <ul>
                    ${course.reviews.map(review => `
                        <li><strong>${review.user}:</strong> ⭐${review.rating}/5 - "${review.comment}"</li>
                    `).join("")}
                </ul>
                <button onclick="enroll('${course.title}')">Enroll Now</button>
            `;

            coursesContainer.appendChild(courseCard);
        });
    }

    function filterCourses() {
        const searchText = searchBar.value.toLowerCase();
        fetch("courses.json")
            .then(response => response.json())
            .then(data => {
                const filteredCourses = data.filter(course =>
                    course.title.toLowerCase().includes(searchText)
                );
                displayCourses(filteredCourses);
            })
            .catch(error => console.error("Error filtering courses:", error));
    }
});

// Enrollment function (optional)
function enroll(courseTitle) {
    alert(`You have enrolled in: ${courseTitle}`);
}
