import React from 'react';

//represents and displays a single card
class Card extends React.Component {
    render = () => {
        return ( 
            <div className="card">
                <div className="top-left">{this.props.suit}</div>
                <div className="value">{this.props.value}</div>
                <div className="bottom-right">{this.props.suit}</div>
            </div>
        );
    };
}

export default Card;