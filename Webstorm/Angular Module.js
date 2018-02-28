import {${pascal}Component} from './${dash}.component';
import {${pascal}Service} from './${dash}.service';

/*@ngInject*/
function routeConfig($stateProvider) {
    $stateProvider.state('main.${camel}', {
        url: '/${dash}',
        component: ''
        data: {pageTitle: ''}
    });
}

/**
 *  Stworzone przez Eryk Mariankowski dnia ${DATE}.
 */
export const ${pascal}Module = angular.module('app.${camel}', [])
    .component('${camel}', ${pascal}Component)
    .service('${pascal}Service', ${pascal}Service)
    .config(routeConfig)
    .name;
