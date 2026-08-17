// =========================
// Dark Mode
// =========================

const themeToggle = document.getElementById("theme-toggle");

themeToggle.addEventListener("click", () => {

    document.body.classList.toggle("dark-mode");

    if (document.body.classList.contains("dark-mode")) {
        themeToggle.textContent = "☀️";
    } else {
        themeToggle.textContent = "🌙";
    }

});


// =========================
// Visitor Counter
// =========================

let visitors = localStorage.getItem("portfolioVisitors");

if (!visitors) {
    visitors = 1;
} else {
    visitors = Number(visitors) + 1;
}

localStorage.setItem("portfolioVisitors", visitors);

document.getElementById("visitor-count").textContent =
    `Visitors: ${visitors}`;


// =========================
// Contact Form
// =========================

const contactForm = document.getElementById("contact-form");

contactForm.addEventListener("submit", (event) => {

    event.preventDefault();

    alert("Thank you! Your message has been submitted.");

    contactForm.reset();

});