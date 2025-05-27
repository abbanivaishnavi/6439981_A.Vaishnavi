const form = document.getElementById("registrationForm");
const nameInput = form.elements["name"];
const emailInput = form.elements["email"];
const eventSelect = form.elements["event"];

const nameError = document.getElementById("nameError");
const emailError = document.getElementById("emailError");
const eventError = document.getElementById("eventError");
const successMessage = document.getElementById("successMessage");

form.addEventListener("submit", function (e) {
  e.preventDefault();

  // Clear previous errors
  nameError.textContent = "";
  emailError.textContent = "";
  eventError.textContent = "";
  successMessage.textContent = "";

  let valid = true;

  // Simple validation
  if (!nameInput.value.trim()) {
    nameError.textContent = "Please enter your name.";
    valid = false;
  }
  if (!emailInput.value.trim()) {
    emailError.textContent = "Please enter your email.";
    valid = false;
  } else if (!/\S+@\S+\.\S+/.test(emailInput.value)) {
    emailError.textContent = "Please enter a valid email.";
    valid = false;
  }
  if (!eventSelect.value) {
    eventError.textContent = "Please select an event.";
    valid = false;
  }

  if (valid) {
    successMessage.textContent = `Thanks, ${nameInput.value}! You registered for ${eventSelect.value}.`;
    form.reset();
  }
});
