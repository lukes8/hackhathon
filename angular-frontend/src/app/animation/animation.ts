import { trigger, style, animate, transition, state } from '@angular/animations';

  export let addSuccess =  trigger('addSuccess', [
    state('in', style({
      opacity: 0,
      transform: 'translateX(0)'
    })),
    transition('* => void', [
      animate(3000, style({
        'color': '#34eb40',
        transform: 'scale(0.85)',
        'font-size': 'large',
        opacity: 0
      }))
    ]),
  ]);