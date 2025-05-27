// Sample event list
const events = [
  { name: "Spring Festival", date: "2025-05-10", seats: 10 },
  { name: "Summer Concert", date: "2025-07-20", seats: 0 },
  { name: "Autumn Marathon", date: "2024-11-05", seats: 25 },
  { name: "Winter Gala", date: "2025-12-01", seats: 5 }
];

// Function to check if event is upcoming and seats available
function isValidEvent(event) {
  const today = new Date();
  const eventDate = new Date(event.date);
  return eventDate >= today && event.seats > 0;
}

// Display valid events
console.log("Upcoming events with available seats:");
events.forEach(event => {
  if (isValidEvent(event)) {
    console.log(`${event.name} on ${event.date} - Seats available: ${event.seats}`);
  }
});

// Registration function with try-catch for error handling
function registerForEvent(eventName) {
  try {
    // Find the event
    const event = events.find(e => e.name === eventName);
    if (!event) throw new Error("Event not found");
    if (!isValidEvent(event)) throw new Error("Event is either full or past");

    // Register seat
    event.seats--;
    console.log(`Successfully registered for ${event.name}. Seats left: ${event.seats}`);

  } catch (error) {
    console.error(`Registration failed: ${error.message}`);
  }
}

// Example usage
registerForEvent("Summer Concert");  // Should fail (seats 0)
registerForEvent("Spring Festival"); // Should succeed
registerForEvent("Nonexistent Event"); // Should fail (event not found)
