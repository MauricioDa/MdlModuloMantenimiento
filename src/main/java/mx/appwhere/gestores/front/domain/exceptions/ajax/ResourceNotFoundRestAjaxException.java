package mx.appwhere.gestores.front.domain.exceptions.ajax;

import mx.appwhere.gestores.front.domain.constants.DomainError;

/**
 * @author Jenaro Bello
 * @version 1.0 - 2017/11/14
 */
public class ResourceNotFoundRestAjaxException extends AjaxException {
    public ResourceNotFoundRestAjaxException(String message, DomainError domainError, Object details) {
        super(message, domainError, details);
    }

    public ResourceNotFoundRestAjaxException(String message, DomainError domainError, Object details, Throwable cause) {
        super(message, domainError, details, cause);
    }

    public ResourceNotFoundRestAjaxException(String message, DomainError domainError) {
        super(message, domainError);
    }

    public ResourceNotFoundRestAjaxException(String message, DomainError domainError, Throwable cause) {
        super(message, domainError, cause);
    }
}
