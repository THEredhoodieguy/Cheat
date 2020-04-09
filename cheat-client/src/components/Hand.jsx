import React from 'react';
import Card from './Card';

//holds the player's hand and has the buttons for the player to submit a move or call a bluff
class Hand extends React.Component {

    render = () => {
        return (
            <div className="hand">
                <div className="player-buttons">
                    <button>Play Cards</button>
                    <button>Call</button>
                </div>
                <div className="cards">
                    {this.props.cards?.map((value, index) => {
                        return <Card key={index} suit={value.suit} value={value.value} />
                    })}
                </div>
            </div>
        );
    };
}

export default Hand;