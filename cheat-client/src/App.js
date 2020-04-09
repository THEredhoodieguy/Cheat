import React from 'react';
import Header from './components/Header';
import Hand from './components/Hand';

import './App.css';

class App extends React.Component {

  render = () => {
    const opps = [{"name": "Steve", "handSize": 12}, {"name":"Dennis", "handSize":22}, {"name":"Dave", "handSize":8}];
    const hand = [{"suit":"♥️", "value":"ace"}, {"suit":"♠️", "value":"two"}, {"suit":"♦️", "value":"three"}, {"suit":"♣️", "value":"four"}];

    return (
      <div className="app">
        <Header opponents={opps}/>
        <Hand cards={hand} />
      </div>
    );
  };
}

export default App;
