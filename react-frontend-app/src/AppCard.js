import React, { useState, useEffect }  from 'react';
import Card from 'react-bootstrap/Card';
import Row from 'react-bootstrap/Row';
import Col from 'react-bootstrap/Col';
import Container from 'react-bootstrap/Container';
import './AppCard.css';

const AppCard = () => {

    const [error, setError] = useState(null);
    const [isLoaded, setIsLoaded] = useState(false);
    const [users, setUsers] = useState([]);
    useEffect(() => {
        fetch("https://jsonplaceholder.typicode.com/users/")
            .then(res => res.json())
            .then(
                (data) => {
                    setIsLoaded(true);
                    setUsers(data);
                },
                (error) => {
                    setIsLoaded(true);
                    setError(error);
                }
            )
      }, []);
      if (error) {
        return <div>Error: {error.message}</div>;
      } else if (!isLoaded) {
        return <div style={{
                    height: '100vh'
                  }} class="font-weight-bold text-uppercase text-center pt-5 mt-5 h2"><p>Loading...</p></div>;
      } 
  
      

    return (
      
     
      
    // <div class="border mx-auto shadow-sm rounded">
    <Container className="app-opacity-animate" style={{
      display: 'flex',
      alignItems: 'center',
      justifyContent: 'center',
      fontSize: 12
  }}>
  
    <Row xs={1} md={4}>
    {users.map(user => (
      <Col>
        <Card role="button" className="clearfix app-rounded-bottom app-card-scale border-0 position-relative shadow mx-auto mt-4 mb-4" 
              style={{ width: '80%', fontSize: 12 }}>
        {/* <div class="bg-primary opacity-50" style={{ height: '2px' }}></div> */}
        <Card.Img className="border-bottom px-5 pt-2 pb-4" variant="top" src="https://cdn.myshoptet.com/usr/www.ovosadba.cz/user/shop/detail/547_pozdni.png?5b9f75e1" />
        <Card.Body>
          <Card.Title>Daruji brambory</Card.Title>
          <Card.Text>
            <ul class="list-group list-group-flush">
              <li class="list-group-item">Darovane jidlo: {user.name}</li>
              <li class="list-group-item">Po zaruce: </li>
              <li class="list-group-item">Misto daru: </li>
              <li class="list-group-item">Rezervace: </li>
              <li class="list-group-item">Cas: </li>         
              <li class="list-group-item">Pocet zajemcu: </li>         
            </ul>
          </Card.Text>
          
          <div class="float-right text-danger">
            <button type="button" class="btn btn-outline-danger mb-3 mt-2">
                  <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-heart" viewBox="0 0 16 16">
                    <path d="m8 2.748-.717-.737C5.6.281 2.514.878 1.4 3.053c-.523 1.023-.641 2.5.314 4.385.92 1.815 2.834 3.989 6.286 6.357 3.452-2.368 5.365-4.542 6.286-6.357.955-1.886.838-3.362.314-4.385C13.486.878 10.4.28 8.717 2.01L8 2.748zM8 15C-7.333 4.868 3.279-3.04 7.824 1.143c.06.055.119.112.176.171a3.12 3.12 0 0 1 .176-.17C12.72-3.042 23.333 4.867 8 15z"></path>
                  </svg> Mam zajem
            </button>
          </div>
        </Card.Body>
        <div class="bg-primary position-absolute bottom-0 start-0" style={{ height: '20px', width: '100%' }}></div>

      </Card>
      </Col>
    ))}
  </Row>
  </Container>
  
  )
  };

  export default AppCard;