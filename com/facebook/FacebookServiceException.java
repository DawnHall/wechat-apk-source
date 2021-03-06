package com.facebook;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class FacebookServiceException extends FacebookException
{
  private static final long serialVersionUID = 1L;
  private final FacebookRequestError error;

  public FacebookServiceException(FacebookRequestError paramFacebookRequestError, String paramString)
  {
    super(paramString);
    this.error = paramFacebookRequestError;
  }

  public final FacebookRequestError getRequestError()
  {
    return this.error;
  }

  public final String toString()
  {
    AppMethodBeat.i(71639);
    String str = "{FacebookServiceException: httpResponseCode: " + this.error.getRequestStatusCode() + ", facebookErrorCode: " + this.error.getErrorCode() + ", facebookErrorType: " + this.error.getErrorType() + ", message: " + this.error.getErrorMessage() + "}";
    AppMethodBeat.o(71639);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.facebook.FacebookServiceException
 * JD-Core Version:    0.6.2
 */