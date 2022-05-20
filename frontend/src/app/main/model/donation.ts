export class Donation {
  id: number;
  title: string;
  type: string[];
  pickupPoint: string;
  reservation: boolean;
  pickupDate: Date;
  likes: number;

  constructor() {
    this.createDefaults();
  }

  createDefaults() {
    this.title = "";
    this.type = [];
    this.pickupPoint = "";
    this.reservation = true;
    this.pickupDate = new Date();
    this.likes = 0;
  }
}
