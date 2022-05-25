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

    const foods = [
      {
        id: 1, foodTitle: 'Daruji brambory', foodName: 'Brambory', outWarranty: 'ano',
        location: 'Havirov', reservation: 'ne', time: '01.01.2022', 
        numLikes: 10, img: 'https://cdn.myshoptet.com/usr/www.ovosadba.cz/user/shop/detail/547_pozdni.png?5b9f75e1'    
      },
      {
        id: 2, foodTitle: 'Daruji sterilovana zelenina', foodName: 'Sterilovana zelenina', outWarranty: 'ano',
        location: 'Senov', reservation: 'ne', time: '01.02.2022', 
        numLikes: 2, img: 'https://i.mimibazar.cz/h/bc/10/131115/20/j148507.jpg'    
      },
      {
        id: 3, foodTitle: 'Daruji banany', foodName: 'Banany', outWarranty: 'ne',
        location: 'Frydek mistek', reservation: 'ne', time: '01.04.2022', 
        numLikes: 7, img: 'https://www.vegmania.cz/wp-content/uploads/2012/12/banan.jpg'
      },
      {
        id: 4, foodTitle: 'Daruji zeleninu', foodName: 'Zelenina smes', outWarranty: 'ano',
        location: 'Praha', reservation: 'ne', time: '05.01.2022', 
        numLikes: 4, img: 'https://blatnicka.hlasenirozhlasu.cz/files/blatnicka/attachments/1188/zelenina.png'    
      },
      {
        id: 5, foodTitle: 'Daruji mrazena verova jatra', foodName: 'Jatra veprova', 
        outWarranty: 'ne', location: 'Ostrava in person', reservation: 'ano', time: '10.01.2022', 
        numLikes: 3, img: 'https://www.masorehak.cz/static/gallery/produkt-34/veprova-jatra1-420.jpg'
      },
      {
        id: 6, foodTitle: 'Daruji sladkosti', foodName: 'Oplatky, cokolady', outWarranty: 'ano',
        location: 'Paskov', reservation: 'ne', time: '01.06.2022', 
        numLikes: 3, img: 'https://www.nicepng.com/png/detail/2-28042_donuts-donut-pink-watercolor-watercolour-sweet-food-donut.png' 
      },
      {
        id: 7, foodTitle: 'Daruji zeleninu', foodName: 'Mrkve, celer, petrzel', outWarranty: 'ne',
        location: 'Havirov', reservation: 'ano', time: '01.10.2022', 
        numLikes: 11, img: 'https://blatnicka.hlasenirozhlasu.cz/files/blatnicka/attachments/1188/zelenina.png'    
      },
      {
        id: 8, foodTitle: 'Daruji stare pecivo', foodName: 'Rohliky na strouhanku', outWarranty: 'ano',
        location: 'Liskovec', reservation: 'ne', time: '01.11.2022', 
        numLikes: 3, img: 'https://vili-mesto.webnode.cz/_files/200000087-a1519a28a6/a.png'
      },
      {
        id: 9, foodTitle: 'Daruji lusteniny', foodName: 'Ryze, cocka', outWarranty: 'ano',
        location: 'Havirov', reservation: 'ne', time: '11.01.2022', 
        numLikes: 12, img: 'https://cdn.myshoptet.com/usr/www.ecoo.cz/user/shop/detail/13064-1_13064-ryze-parboiled.jpg?5e92d7cc'
      },
      {
        id: 10, foodTitle: 'Daruji lusteniny', foodName: 'Cizrna, fazole', outWarranty: 'ano',
        location: 'Ostravice', reservation: 'ne', time: '12.01.2022', 
        numLikes: 3, img: 'https://superpotraviny.webnode.cz/_files/system_preview_detail_200002684-b70ffb8093/awa_lusteniny.jpg'
      }
    ];

    /* Randomize array in-place using Durstenfeld shuffle algorithm */
    function shuffleArray(array) {
      for (var i = array.length - 1; i > 0; i--) {
          var j = Math.floor(Math.random() * (i + 1));
          var temp = array[i];
          array[i] = array[j];
          array[j] = temp;
      }
    }

    // shuffleArray(foods)

    //todo
    const addLike = (id) => {
      ;
    }


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
    {foods.map(food => (
      <Col>
        <Card role="button" className="clearfix app-rounded-bottom app-card-scale border-0 position-relative shadow mx-auto mt-4 mb-4" 
              style={{ width: '80%', fontSize: 12 }}>
        {/* <div class="bg-primary opacity-50" style={{ height: '2px' }}></div> */}
        <Card.Img className="border-bottom px-4 pt-2 pb-2"
              style={{ minHeight: '100%' }}
              variant="top" 
              // src="https://cdn.myshoptet.com/usr/www.ovosadba.cz/user/shop/detail/547_pozdni.png?5b9f75e1" 
              src={food.img}
              />
        <Card.Body>
          <Card.Title>{food.foodTitle}</Card.Title>
          <Card.Text className="mb-0">
            <ul class="list-group list-group-flush">
              <li class="list-group-item">Darovane jidlo: {food.foodName}</li>
              <li class="list-group-item">Po zaruce: {food.outWarranty}</li>
              <li class="list-group-item">Misto daru: {food.location}</li>
              <li class="list-group-item">Rezervace: {food.reservation}</li>
              <li class="list-group-item">Cas: {food.time}</li>         
              <li class="list-group-item">Pocet zajemcu: {food.numLikes}</li>         
            </ul>
          </Card.Text>
          
          <div class="float-right text-danger">
            <button type="button" class="btn btn-outline-danger mb-3 mt-2" >
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