import {DefaultDataServiceConfig} from "@ngrx/data";
import {NgxLoggerLevel} from "ngx-logger";

export const environment = {
  production: true,
  logLevel: NgxLoggerLevel.TRACE,
  serverLogLevel: NgxLoggerLevel.INFO
};

export const defaultDataServiceConfig: DefaultDataServiceConfig = {
  root: 'https://for-developers-343319.ey.r.appspot.com',
  timeout: 120000, // request timeout
};
