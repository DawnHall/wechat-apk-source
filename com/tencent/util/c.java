package com.tencent.util;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.security.Key;
import java.security.spec.KeySpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class c
{
  public static byte[] encode(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(86577);
    Object localObject = new DESedeKeySpec(Coffee.dSI().getBytes());
    localObject = SecretKeyFactory.getInstance("desede").generateSecret((KeySpec)localObject);
    Cipher localCipher = Cipher.getInstance("desede/CBC/PKCS5Padding");
    localCipher.init(1, (Key)localObject, new IvParameterSpec("68881999".getBytes()));
    paramArrayOfByte = localCipher.doFinal(paramArrayOfByte);
    AppMethodBeat.o(86577);
    return paramArrayOfByte;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.util.c
 * JD-Core Version:    0.6.2
 */