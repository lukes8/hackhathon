export interface Card {
  id: number;
  title: string;
  type: string[];
  pickupPoint: string;
  reservation: boolean;
  pickupDate: Date;
  likes: number;
}
