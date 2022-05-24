import Form from 'react-bootstrap/Form';
import Container from 'react-bootstrap/Container';
import Button from 'react-bootstrap/Button';

const AppForm = () => (


    // <div class="border w-50 mx-auto p-4 shadow-sm rounded mb-5 mt-5">
    <Container className=" app-opacity-animate mb-5 mt-5 border px-4 pb-4 w-50 shadow" style={{
      display: 'flex',
      alignItems: 'center',
      justifyContent: 'center'
  }}>
    
    <div class="pl-4 pr-5 mx-4">
      
      <h1>D<br/>a<br/>r<br/>u<br/>j<br/>i</h1>
    
    </div>
    <Form style={{ width: '30rem' }} className="needs-validation" novalidate>
    <Form.Group className="mb-3 mt-3" controlId="formBasicGiftName">
    <Form.Label>Nazev daru</Form.Label>
    <Form.Control type="text" placeholder="Enter name of gift" required />
    </Form.Group>
  
    <Form.Group className="mb-3" controlId="formBasicGiftFood">
      <Form.Label>Darovane jidlo</Form.Label>
      <Form.Control type="text" placeholder="Enter name of gift" required />
    </Form.Group>
  
    <Form.Group className="mb-3" controlId="formBasicGiftZaruka">
      <Form.Label>Po zaruce</Form.Label>
      <Form.Check type="radio" label="Ano" id="radioZarukaAno" name="radioZaruka"/>
      <Form.Check type="radio" label="Ne" id="radioZarukaNe" name="radioZaruka"/>
    </Form.Group>
  
  
    <Form.Group className="mb-3" controlId="formBasicGiftLocation">
      <Form.Label>Misto daru</Form.Label>
      <Form.Control type="text" placeholder="Enter name of gift" required />
    </Form.Group>
  
    
    <Form.Group className="mb-3" controlId="formBasicGiftReservation">
      <Form.Label>Rezervace</Form.Label>
      <Form.Control type="text" placeholder="Enter name of gift" required />
    </Form.Group>
  
    <Form.Group className="mb-3" controlId="formBasicGiftTime">
      <Form.Label>Cas</Form.Label>
      <Form.Control type="text" placeholder="Enter name of gift" required />
    </Form.Group>
  
    <Button variant="primary" type="submit">
      Vlozit dar
    </Button>
  </Form>
  
  </Container>
  
  
  );

  export default AppForm;