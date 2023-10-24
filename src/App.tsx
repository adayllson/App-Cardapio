import { FoodData } from './Interface/FoodData';
import './App.css'
import { Card } from './components/card/card';

function App() {
  const data: FoodData[] = [];

  return (
    
      <div className="container">
        <h1>Cardápio</h1>
        <div className="card-grid">
          {data.map(_foodData => <Card 
          price={_foodData.price} 
          title={_foodData.title} 
          image={_foodData.image}
          />
          )}
        </div>
      </div>
      
    
  )
}

export default App
