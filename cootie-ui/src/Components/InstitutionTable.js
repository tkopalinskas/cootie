import React, { Component } from 'react';
import { Table, Alert } from 'react-bootstrap'

import BaseModal from './BaseModal'

class InstitutionTable extends Component {

    state = {
        showModal: false
    }

    componentWillMount() {
        //fetch data from api
    }

    onColumnClick(id) {
        //fetch from api by id
        this.toggleModal();
    }

    toggleModal = () => {
        this.setState({
            showModal: !this.state.showModal
        });
    }

    renderAlert() {
        return (
            <Alert bsStyle="warning">
                <strong>Trūksta institicijų</strong>
            </Alert>
        )
    }

    render() {

        const institutions = this.props.institutions

        if (!institutions || institutions.length < 3) {
            return this.renderAlert();
        }

        return (
            <div>
                <BaseModal body={"hello"} open={this.state.showModal} onClose={this.toggleModal} />
                <Table striped bordered condensed hover>
                    <thead>
                        <tr>
                            <th className="text-left">Institucija</th>
                        </tr>
                    </thead>
                    <tbody>
                        {institutions.map((institution, index) => {
                            return <tr onClick={this.onColumnClick.bind(this, institution.id)} className="cursorpointer" key={index}>
                                <td>{institution.name}</td>
                            </tr>
                        })}
                    </tbody>
                </Table>
            </div>
        );
    }
}

export default InstitutionTable;