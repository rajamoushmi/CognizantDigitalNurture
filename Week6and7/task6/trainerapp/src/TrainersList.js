import React from 'react';
import { Link } from 'react-router-dom'; // Import Link
import trainersMock from './TrainersMock'; // Import mock data

function TrainersList() {
  return (
    <div>
      <h1>Trainers List</h1>
      <ul>
        {trainersMock.map(trainer => (
          <li key={trainer.trainerId}>
            {/* Link to TrainerDetail component, passing trainerId as a URL parameter */}
            <Link to={`/trainers/${trainer.trainerId}`}>{trainer.name}</Link>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default TrainersList;