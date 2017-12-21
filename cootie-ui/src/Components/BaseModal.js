import React, { Component } from 'react';
import { Modal, Button } from 'react-bootstrap'

class BaseModal extends Component {

    render() {

        if(!this.props.open) {
            return null;
          }

        return (
            <div>
                <Modal show={this.props.open} onHide={this.props.onClose}>
                    <Modal.Header closeButton>
                        <Modal.Title>{this.props.header}</Modal.Title>
                    </Modal.Header>
                    <Modal.Body>
                        {this.props.body}
                    </Modal.Body>
                    <Modal.Footer>
                        <Button onClick={this.props.onClose}>Close</Button>
                    </Modal.Footer>
                </Modal>
            </div>
        );
    }
}

export default BaseModal;