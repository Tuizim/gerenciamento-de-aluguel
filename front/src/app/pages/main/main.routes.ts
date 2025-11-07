import { Routes } from "@angular/router";
import { Welcome } from "../layouts/welcome/welcome";
import { Monitor } from "../layouts/monitor/monitor";
import { Main } from "./main";

export const MAIN_ROUTES: Routes = [
  {
    path: '',
    component: Main,
    children: [
      { path: '', redirectTo: 'welcome', pathMatch: 'full' },
      { path: 'welcome', component: Welcome },
      { path: 'monitor', component: Monitor },
    ],
  },
];