import React from 'react';
import { BrowserRouter as Router, Routes, Route, Link } from 'react-router-dom'; // Import router components
import Home from './Home';
import TrainersList from './TrainersList';
import TrainerDetail from './TrainerDetail'; 
import './App.css'; // Keep default styles or add your own

function App() {
  return (
    <Router>
      <div className="App">
        <h1>My Academy Trainers App</h1> 
        <nav>
          <Link to="/">Home</Link> |{' '} {/* Navigation link to Home */}
          <Link to="/trainers">Show Trainers</Link> {/* Navigation link to TrainersList */}
        </nav>
        <hr /> {/* Separator */}
        <Routes>
          <Route path="/" element={<Home />} /> {/* Route for Home component */}
          <Route path="/trainers" element={<TrainersList />} /> {/* Route for TrainersList */}
          <Route path="/trainers/:id" element={<TrainerDetail />} /> {/* Route for TrainerDetail with ID parameter */}
        </Routes>
      </div>
    </Router>
  );
}

export default App;