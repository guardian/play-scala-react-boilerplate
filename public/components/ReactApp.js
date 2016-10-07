import React from 'react';
import ReactDOM from 'react-dom';

require('../stylesheets/main.scss');

export default class ReactApp extends React.Component {

  render() {
    return (
      <div>
        <div>
          {this.props.children}
        </div>
      </div>
    );
  }
}
