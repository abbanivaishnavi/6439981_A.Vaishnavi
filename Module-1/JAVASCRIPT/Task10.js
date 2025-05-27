// Original events array
const events = [
  { id: 1, name: "Music Fest", category: "Music", date: "2025-08-10", seats: 100 },
  { id: 2, name: "Art Expo", category: "Art", date: "2025-09-15", seats: 50 },
  { id: 3, name: "Tech Talk", category: "Tech", date: "2025-07-20", seats: 75 }
];

// Function to filter events by category with default parameter and destructuring
const filterEvents = (eventList = [], category = "all") => {
  // Clone eventList with spread operator to avoid mutation
  const clonedList = [...eventList];

  return clonedList.filter(({ category: eventCategory }) =>
    category === "all" ? true : eventCategory === category
  );
};

// Usage example
const filteredMusicEvents = filterEvents(events, "Music");

console.log(filteredMusicEvents);

// Output event names using destructuring and template literals
filteredMusicEvents.forEach(({ name, date }) =>
  console.log(`Event: ${name} on ${date}`)
);
