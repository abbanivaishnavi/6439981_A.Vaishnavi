const form = document.getElementById("registrationForm");

form.addEventListener("submit", function (e) {
  e.preventDefault();
  console.log("Form submission started");

  const formData = {
    name: form.elements["name"].value.trim(),
    email: form.elements["email"].value.trim(),
    event: form.elements["event"].value,
  };
  console.log("Collected form data:", formData);

  // Debugger statement to pause in DevTools
  debugger;

  fetch("https://mockapi.io/endpoint/register", {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(formData),
  })
    .then((response) => {
      console.log("Fetch response received:", response);
      if (!response.ok) {
        throw new Error(`Server error: ${response.status}`);
      }
      return response.json();
    })
    .then((data) => {
      console.log("Server response data:", data);
      alert("Registration successful!");
      form.reset();
    })
    .catch((error) => {
      console.error("Registration failed:", error);
      alert(`Registration failed: ${error.message}`);
    });
});
