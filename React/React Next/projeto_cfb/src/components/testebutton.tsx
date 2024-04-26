import React from "react";
import { Button } from "react-bootstrap";

interface ProductCardProps {
  image: string;
  name: string;
  price: number;
  actionText: string;
}

const ProductCard: React.FC<ProductCardProps> = ({
  image,
  name,
  price,
  actionText,
}) => {
  return (
    <div className="product-card">
      <img src={image} alt={name} />
      <h3>{name}</h3>
      <h4>R${price.toFixed(2)}</h4>
      <Button variant="primary">
        {actionText}
      </Button>
    </div>
  );
};

export default ProductCard;