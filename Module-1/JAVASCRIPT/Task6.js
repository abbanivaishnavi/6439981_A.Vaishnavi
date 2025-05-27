// Initial empty array for events
const allEvents = [];

// Add new events using .push()
allEvents.push(
  { name: "Workshop on Baking", category: "Cooking", date: "2025-06-05" },
  { name: "Jazz Night", category: "Music", date: "2025-06-10" },
  { name: "Rock Concert", category: "Music", date: "2025-07-15" },
  { name: "Photography Basics", category: "Art", date: "2025-06-20" }
);

// Filter to show only music events
const musicEvents = allEvents.filter(event => event.category === "Music");
console.log("Music Events:", musicEvents);

// Map to format display cards
const displayCards = allEvents.map(event => `Event: ${event.name} - Category: ${event.category}`);
console.log("Display Cards:", displayCards);
