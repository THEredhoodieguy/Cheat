import React from 'react';

class Header extends React.Component {
    render = () => {
        return (
            <div className="header">
                <button>Play Cards</button>
                <button>Call</button>
                {this.props.opponents?.map((value, index) => {
                    return <div key={index} className="opponent">{value.name}: {value.handSize}</div>
                })}
            </div>
        );
    };
}

export default Header;