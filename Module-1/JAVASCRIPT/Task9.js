const eventsContainer = document.querySelector("#eventsContainer");
const spinner = document.querySelector("#spinner");

// Mock API endpoint (replace with actual if needed)
const apiURL = "https://mockapi.io/projects/yourproject/events"; 
// For demonstration, we'll use a placeholder JSON URL here:
const mockAPI = "https://jsonplaceholder.typicode.com/posts?_limit=3";

// Using .then() and .catch()
function fetchEventsThen() {
  spinner.style.display = "block";
  eventsContainer.innerHTML = "";

  fetch(mockAPI)
    .then(response => {
      if (!response.ok) throw new Error("Network response was not OK");
      return response.json();
    })
    .then(data => {
      spinner.style.display = "none";
      // Here data is array of posts, for demo mapping posts to event format
      data.forEach(item => {
        const div = document.createElement("div");
        div.textContent = `Event Title: ${item.title}`;
        eventsContainer.appendChild(div);
      });
    })
    .catch(error => {
      spinner.style.display = "none";
      eventsContainer.textContent = `Error fetching events: ${error.message}`;
    });
}

// Using async/await
async function fetchEventsAsync() {
  spinner.style.display = "block";
  eventsContainer.innerHTML = "";

  try {
    const response = await fetch(mockAPI);
    if (!response.ok) throw new Error("Network response was not OK");

    const data = await response.json();

    spinner.style.display = "none";

    data.forEach(item => {
      const div = document.createElement("div");
      div.textContent = `Event Title: ${item.title}`;
      eventsContainer.appendChild(div);
    });
  } catch (error) {
    spinner.style.display = "none";
    eventsContainer.textContent = `Error fetching events: ${error.message}`;
  }
}

// Call one of these to test
// fetchEventsThen();
fetchEventsAsync();
