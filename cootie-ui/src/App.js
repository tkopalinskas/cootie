import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';

import InstitutionTable from './Components/InstitutionTable'

class App extends Component {
  render() {
    return (
      <div className="App">
        <InstitutionTable institutions={[{"name": "Institution 1", "id": 1}, {"name": "Institution 2", "id": 2}, {"name": "Institution 3", "id": 3}, {"name": "Institution 4", "id": 4}]} />
      </div>
    );
  }
}

export default App;
