const events = [
  { id: 1, name: "Music Fest", category: "Music", date: "2025-08-10", seats: 100, registrations: 0 },
  { id: 2, name: "Art Expo", category: "Art", date: "2025-09-15", seats: 50, registrations: 0 },
  { id: 3, name: "Tech Talk", category: "Tech", date: "2025-07-20", seats: 75, registrations: 0 }
];

const eventsContainer = document.querySelector("#eventsContainer");
const categoryFilter = document.querySelector("#categoryFilter");
const searchInput = document.querySelector("#searchInput");

// Function to render events filtered by category and search
function renderEvents(filterCategory = "all", searchTerm = "") {
  eventsContainer.innerHTML = "";

  const filteredEvents = events.filter(event => {
    const matchesCategory = filterCategory === "all" || event.category === filterCategory;
    const matchesSearch = event.name.toLowerCase().includes(searchTerm.toLowerCase());
    return matchesCategory && matchesSearch;
  });

  filteredEvents.forEach(event => {
    const card = document.createElement("div");
    card.classList.add("eventCard");
    card.style.border = "1px solid #ccc";
    card.style.padding = "10px";
    card.style.margin = "10px 0";

    const title = document.createElement("h3");
    title.textContent = event.name;

    const date = document.createElement("p");
    date.textContent = `Date: ${event.date}`;

    const seats = document.createElement("p");
    seats.textContent = `Seats left: ${event.seats - event.registrations}`;

    const registerBtn = document.createElement("button");
    registerBtn.textContent = "Register";
    registerBtn.disabled = event.registrations >= event.seats;
    
    // onclick to register
    registerBtn.onclick = () => {
      if (event.registrations < event.seats) {
        event.registrations++;
        alert(`Registered for ${event.name}`);
        renderEvents(categoryFilter.value, searchInput.value);
      }
    };

    card.appendChild(title);
    card.appendChild(date);
    card.appendChild(seats);
    card.appendChild(registerBtn);

    eventsContainer.appendChild(card);
  });
}

// onchange filter by category
categoryFilter.onchange = () => {
  renderEvents(categoryFilter.value, searchInput.value);
};

// keydown for quick search
searchInput.addEventListener("keydown", () => {
  // Small delay to get the latest input value
  setTimeout(() => {
    renderEvents(categoryFilter.value, searchInput.value);
  }, 100);
});

// Initial render
renderEvents();
