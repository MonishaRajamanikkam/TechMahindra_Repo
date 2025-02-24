document.addEventListener("DOMContentLoaded", function () {
    const instructorsContainer = document.getElementById("instructors-container");
    const searchInput = document.getElementById("searchInstructor");

    // Fetch instructor data
    fetch("instructors.json")
        .then(response => response.json())
        .then(instructors => {
            displayInstructors(instructors);

            // Search functionality
            searchInput.addEventListener("input", function () {
                const query = searchInput.value.toLowerCase();
                const filteredInstructors = instructors.filter(instructor =>
                    instructor.name.toLowerCase().includes(query)
                );
                displayInstructors(filteredInstructors);
            });
        })
        .catch(error => console.error("Error loading instructors:", error));

    function displayInstructors(instructors) {
        instructorsContainer.innerHTML = ""; // Clear previous data
        instructors.forEach(instructor => {
            const instructorCard = document.createElement("div");
            instructorCard.classList.add("instructor-card");

            instructorCard.innerHTML = `
                <img src="${instructor.image}" alt="${instructor.name}">
                <h3>${instructor.name}</h3>
                <p>${instructor.bio}</p>
                <h4>Courses:</h4>
                <ul>
                    ${instructor.courses.map(course => `<li>${course}</li>`).join("")}
                </ul>
            `;

            instructorsContainer.appendChild(instructorCard);
        });
    }
});
