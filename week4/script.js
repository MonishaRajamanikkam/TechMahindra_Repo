document.addEventListener("DOMContentLoaded", function () {
    // Fetch and Display Courses
    fetch("data/courses.json")
        .then(response => response.json())
        .then(courses => {
            let courseContainer = document.querySelector(".courses-container");
            courses.forEach(course => {
                let courseElement = document.createElement("div");
                courseElement.classList.add("course-card");
                courseElement.innerHTML = `
                    <h3>${course.title}</h3>
                    <p>Instructor: ${course.instructor}</p>
                    <p>Price: ${course.price}</p>
                    <p>Rating: ${course.rating}</p>
                `;
                courseContainer.appendChild(courseElement);
            });
        })
        .catch(error => console.error("Error loading courses:", error));

    // Course Filtering Function
    window.filterCourses = function (category) {
        fetch("data/courses.json")
            .then(response => response.json())
            .then(courses => {
                let courseContainer = document.querySelector(".courses-container");
                courseContainer.innerHTML = ""; // Clear previous courses
                let filteredCourses = courses.filter(course => course.category === category);

                filteredCourses.forEach(course => {
                    let courseElement = document.createElement("div");
                    courseElement.classList.add("course-card");
                    courseElement.innerHTML = `
                        <h3>${course.title}</h3>
                        <p>Instructor: ${course.instructor}</p>
                        <p>Price: ${course.price}</p>
                        <p>Rating: ${course.rating}</p>
                    `;
                    courseContainer.appendChild(courseElement);
                });
            })
            .catch(error => console.error("Error loading courses:", error));
    };

    // Smooth Scrolling for Navigation Links
    document.querySelectorAll('nav a').forEach(anchor => {
        anchor.addEventListener('click', function (event) {
            event.preventDefault();
            const target = document.querySelector(this.getAttribute('href'));
            if (target) {
                target.scrollIntoView({ behavior: 'smooth' });
            }
        });
    });

    // ✅ Carousel Auto-Slide (Fixed)
    const carousel = document.getElementById("carousel");
    const items = document.querySelectorAll(".carousel-item"); // Correct selector
    let index = 0;
    const intervalTime = 3000; // 3 seconds

    function moveCarousel() {
        index++;
        if (index >= items.length) {
            index = 0; // Reset to first image
        }
        const itemWidth = items[0].clientWidth; // Get dynamic width
        carousel.style.transform = `translateX(${-index * itemWidth}px)`;
    }

    // Automatically move carousel every 3 seconds
    setInterval(moveCarousel, intervalTime);
});
