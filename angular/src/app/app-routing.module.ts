import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {ClientDetailComponent} from './client/client-detail/client-detail.component';
import {ClientOverviewComponent} from './client/client-overview/client-overview.component';
import {ClientVisitOverviewComponent} from './client/client-visit-overview/client-visit-overview.component';
import {ClientVisitDetailComponent} from './client/client-visit-detail/client-visit-detail.component';
import {ClientBellyAnalysisOverviewComponent} from './client/client-belly-analysis-overview/client-belly-analysis-overview.component';
import {FutureClientComponent} from "./future-client/future-client.component";
import {EmailsComponent} from "./emails/emails.component";

const routes: Routes = [
  {path: 'client', component: ClientOverviewComponent},
  {path: 'client-detail', component: ClientDetailComponent},
  {path: 'client-visit-overview', component: ClientVisitOverviewComponent},
  {path: 'client-visit-detail', component: ClientVisitDetailComponent},
  {path: 'client-belly-analysis-overview', component: ClientBellyAnalysisOverviewComponent},
  {path: 'future-client', component: FutureClientComponent},
  {path: 'emails', component: EmailsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
