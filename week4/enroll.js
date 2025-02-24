document.addEventListener("DOMContentLoaded", () => {
    const enrollmentForm = document.getElementById("enrollmentForm");
    const confirmationMessage = document.getElementById("confirmationMessage");

    enrollmentForm.addEventListener("submit", (event) => {
        event.preventDefault(); // Prevent form submission

        // Get input values
        const fullName = document.getElementById("fullName").value.trim();
        const email = document.getElementById("email").value.trim();
        const selectedCourse = document.getElementById("courseSelect").value;

        // Validate input
        if (fullName === "" || email === "" || selectedCourse === "") {
            confirmationMessage.style.color = "red";
            confirmationMessage.textContent = "Please fill out all fields.";
            return;
        }

        // Display confirmation message
        confirmationMessage.style.color = "green";
        confirmationMessage.textContent = `Thank you, ${fullName}! You have successfully enrolled in ${selectedCourse}.`;

        // Optionally, reset the form
        enrollmentForm.reset();
    });
});
