const form = document.getElementById("registrationForm");
const successMessage = document.getElementById("successMessage");
const errorMessage = document.getElementById("errorMessage");

form.addEventListener("submit", function (e) {
  e.preventDefault();

  // Clear previous messages
  successMessage.textContent = "";
  if (errorMessage) errorMessage.textContent = "";

  // Gather data
  const formData = {
    name: form.elements["name"].value.trim(),
    email: form.elements["email"].value.trim(),
    event: form.elements["event"].value,
  };

  // Simulate server delay with setTimeout wrapped in a Promise
  function mockPost(data) {
    return new Promise((resolve, reject) => {
      setTimeout(() => {
        // Simulate success 80% of the time
        if (Math.random() < 0.8) {
          resolve({ status: 200, message: "Registration successful!" });
        } else {
          reject({ status: 500, message: "Server error. Try again later." });
        }
      }, 2000); // 2 seconds delay
    });
  }

  // Show loading
  successMessage.textContent = "Submitting registration...";

  // Call mockPost to simulate fetch POST
  mockPost(formData)
    .then((response) => {
      successMessage.textContent = response.message;
      form.reset();
    })
    .catch((error) => {
      successMessage.textContent = "";
      if (!errorMessage) {
        const errSpan = document.createElement("span");
        errSpan.style.color = "red";
        errSpan.id = "errorMessage";
        form.appendChild(errSpan);
      }
      document.getElementById("errorMessage").textContent = error.message;
    });
});
