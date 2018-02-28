#set ( $d = "$")
const API_SERVICE_NAME = '';

export class ${pascal}Service {

    /*@ngInject*/
    constructor(${d}http) {
        this.${d}http = ${d}http;
    }

    stub(params) {
        return this.${d}http.post(API_SERVICE_NAME + 'stub', params);
    }

}
