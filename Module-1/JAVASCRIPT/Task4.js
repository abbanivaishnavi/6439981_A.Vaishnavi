// Array to hold events
const events = [];

// Function to add an event
function addEvent(name, date, category, seats) {
  events.push({ name, date, category, seats, registrations: 0 });
}

// Function to register a user for an event by name
function registerUser(eventName) {
  const event = events.find(e => e.name === eventName);
  if (!event) {
    console.log("Event not found");
    return;
  }
  if (event.seats <= event.registrations) {
    console.log("No seats available");
    return;
  }
  event.registrations++;
  console.log(`User registered for ${eventName}. Total registrations: ${event.registrations}`);
}

// Closure to track total registrations per category
function registrationTracker() {
  const registrationsByCategory = {};

  return {
    addRegistration(category) {
      registrationsByCategory[category] = (registrationsByCategory[category] || 0) + 1;
    },
    getRegistrations(category) {
      return registrationsByCategory[category] || 0;
    }
  };
}

const tracker = registrationTracker();

// Higher-order function to filter events dynamically by a callback
function filterEventsByCategory(callback) {
  return events.filter(callback);
}

// Usage examples

// Add events
addEvent("Music Fest", "2025-08-10", "Music", 100);
addEvent("Art Expo", "2025-09-15", "Art", 50);
addEvent("Tech Talk", "2025-07-20", "Technology", 75);

// Register users and track registrations by category
registerUser("Music Fest");
tracker.addRegistration("Music");

registerUser("Art Expo");
tracker.addRegistration("Art");

// Filter events by category (e.g., Music events only)
const musicEvents = filterEventsByCategory(event => event.category === "Music");
console.log("Music Events:", musicEvents);

// Check total registrations for Music category
console.log("Total registrations for Music:", tracker.getRegistrations("Music"));
