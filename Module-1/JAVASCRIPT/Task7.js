// Sample events data
const events = [
  { id: 1, name: "Music Fest", date: "2025-08-10", seats: 100, registrations: 0 },
  { id: 2, name: "Art Expo", date: "2025-09-15", seats: 50, registrations: 0 },
  { id: 3, name: "Tech Talk", date: "2025-07-20", seats: 75, registrations: 0 }
];

// Reference to the container div
const eventsContainer = document.querySelector("#eventsContainer");

// Function to render all events
function renderEvents() {
  eventsContainer.innerHTML = ""; // Clear existing content

  events.forEach(event => {
    // Create card container
    const card = document.createElement("div");
    card.classList.add("eventCard");
    card.style.border = "1px solid #ccc";
    card.style.padding = "10px";
    card.style.margin = "10px 0";

    // Event details
    const title = document.createElement("h3");
    title.textContent = event.name;

    const date = document.createElement("p");
    date.textContent = `Date: ${event.date}`;

    const seats = document.createElement("p");
    seats.textContent = `Seats left: ${event.seats - event.registrations}`;

    // Register button
    const registerBtn = document.createElement("button");
    registerBtn.textContent = "Register";
    registerBtn.disabled = event.registrations >= event.seats;
    registerBtn.addEventListener("click", () => {
      if (event.registrations < event.seats) {
        event.registrations++;
        alert(`Registered for ${event.name}!`);
        renderEvents(); // Update UI
      }
    });

    // Cancel registration button
    const cancelBtn = document.createElement("button");
    cancelBtn.textContent = "Cancel Registration";
    cancelBtn.disabled = event.registrations === 0;
    cancelBtn.style.marginLeft = "10px";
    cancelBtn.addEventListener("click", () => {
      if (event.registrations > 0) {
        event.registrations--;
        alert(`Cancelled registration for ${event.name}`);
        renderEvents(); // Update UI
      }
    });

    // Append elements to card
    card.appendChild(title);
    card.appendChild(date);
    card.appendChild(seats);
    card.appendChild(registerBtn);
    card.appendChild(cancelBtn);

    // Append card to container
    eventsContainer.appendChild(card);
  });
}

// Initial render
renderEvents();
