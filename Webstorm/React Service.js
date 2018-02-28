/**
 *  Stworzone przez Eryk Mariankowski dnia ${DATE}.
 */
import AjaxService from '';

class ${NAME} extends AjaxService {

    stub = (callback) => {
        const axios = AjaxService.axios;
        axios.get(AjaxService.url(''))
            .then((response) => {
                callback(response.data);
            });
    };

}

export default new ${NAME}();
