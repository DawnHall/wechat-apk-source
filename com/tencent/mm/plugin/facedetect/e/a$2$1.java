package com.tencent.mm.plugin.facedetect.e;

final class a$2$1
  implements Runnable
{
  a$2$1(a.2 param2)
  {
  }

  // ERROR //
  public final void run()
  {
    // Byte code:
    //   0: sipush 543
    //   3: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: getfield 19	com/tencent/mm/plugin/facedetect/e/a$2$1:lZz	Lcom/tencent/mm/plugin/facedetect/e/a$2;
    //   10: getfield 37	com/tencent/mm/plugin/facedetect/e/a$2:lZv	Lcom/tencent/mm/plugin/facedetect/e/a;
    //   13: invokestatic 43	com/tencent/mm/plugin/facedetect/e/a:g	(Lcom/tencent/mm/plugin/facedetect/e/a;)Lcom/tencent/mm/plugin/mmsight/model/a/d;
    //   16: ifnull +18 -> 34
    //   19: aload_0
    //   20: getfield 19	com/tencent/mm/plugin/facedetect/e/a$2$1:lZz	Lcom/tencent/mm/plugin/facedetect/e/a$2;
    //   23: getfield 37	com/tencent/mm/plugin/facedetect/e/a$2:lZv	Lcom/tencent/mm/plugin/facedetect/e/a;
    //   26: invokestatic 43	com/tencent/mm/plugin/facedetect/e/a:g	(Lcom/tencent/mm/plugin/facedetect/e/a;)Lcom/tencent/mm/plugin/mmsight/model/a/d;
    //   29: invokeinterface 48 1 0
    //   34: aload_0
    //   35: getfield 19	com/tencent/mm/plugin/facedetect/e/a$2$1:lZz	Lcom/tencent/mm/plugin/facedetect/e/a$2;
    //   38: getfield 37	com/tencent/mm/plugin/facedetect/e/a$2:lZv	Lcom/tencent/mm/plugin/facedetect/e/a;
    //   41: invokestatic 52	com/tencent/mm/plugin/facedetect/e/a:d	(Lcom/tencent/mm/plugin/facedetect/e/a;)V
    //   44: aload_0
    //   45: getfield 19	com/tencent/mm/plugin/facedetect/e/a$2$1:lZz	Lcom/tencent/mm/plugin/facedetect/e/a$2;
    //   48: getfield 37	com/tencent/mm/plugin/facedetect/e/a$2:lZv	Lcom/tencent/mm/plugin/facedetect/e/a;
    //   51: invokestatic 56	com/tencent/mm/plugin/facedetect/e/a:a	(Lcom/tencent/mm/plugin/facedetect/e/a;)Ljava/lang/Object;
    //   54: astore_1
    //   55: aload_1
    //   56: monitorenter
    //   57: aload_0
    //   58: getfield 19	com/tencent/mm/plugin/facedetect/e/a$2$1:lZz	Lcom/tencent/mm/plugin/facedetect/e/a$2;
    //   61: getfield 37	com/tencent/mm/plugin/facedetect/e/a$2:lZv	Lcom/tencent/mm/plugin/facedetect/e/a;
    //   64: getstatic 62	com/tencent/mm/plugin/facedetect/e/a$a:lZI	Lcom/tencent/mm/plugin/facedetect/e/a$a;
    //   67: invokestatic 65	com/tencent/mm/plugin/facedetect/e/a:a	(Lcom/tencent/mm/plugin/facedetect/e/a;Lcom/tencent/mm/plugin/facedetect/e/a$a;)Lcom/tencent/mm/plugin/facedetect/e/a$a;
    //   70: pop
    //   71: aload_1
    //   72: monitorexit
    //   73: invokestatic 71	com/tencent/mm/plugin/facedetect/model/FaceContextData:bss	()Lcom/tencent/mm/plugin/facedetect/model/FaceContextData;
    //   76: getfield 75	com/tencent/mm/plugin/facedetect/model/FaceContextData:lTH	J
    //   79: iconst_2
    //   80: aload_0
    //   81: getfield 21	com/tencent/mm/plugin/facedetect/e/a$2$1:gIb	I
    //   84: invokestatic 80	com/tencent/mm/plugin/facedetect/model/FaceDetectReporter:i	(JII)V
    //   87: sipush 543
    //   90: invokestatic 83	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   93: return
    //   94: astore_2
    //   95: ldc 85
    //   97: ldc 87
    //   99: iconst_1
    //   100: anewarray 4	java/lang/Object
    //   103: dup
    //   104: iconst_0
    //   105: aload_2
    //   106: invokevirtual 91	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   109: aastore
    //   110: invokestatic 97	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   113: aload_0
    //   114: getfield 19	com/tencent/mm/plugin/facedetect/e/a$2$1:lZz	Lcom/tencent/mm/plugin/facedetect/e/a$2;
    //   117: getfield 37	com/tencent/mm/plugin/facedetect/e/a$2:lZv	Lcom/tencent/mm/plugin/facedetect/e/a;
    //   120: invokestatic 52	com/tencent/mm/plugin/facedetect/e/a:d	(Lcom/tencent/mm/plugin/facedetect/e/a;)V
    //   123: goto -79 -> 44
    //   126: astore_2
    //   127: aload_0
    //   128: getfield 19	com/tencent/mm/plugin/facedetect/e/a$2$1:lZz	Lcom/tencent/mm/plugin/facedetect/e/a$2;
    //   131: getfield 37	com/tencent/mm/plugin/facedetect/e/a$2:lZv	Lcom/tencent/mm/plugin/facedetect/e/a;
    //   134: invokestatic 52	com/tencent/mm/plugin/facedetect/e/a:d	(Lcom/tencent/mm/plugin/facedetect/e/a;)V
    //   137: sipush 543
    //   140: invokestatic 83	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   143: aload_2
    //   144: athrow
    //   145: astore_2
    //   146: aload_1
    //   147: monitorexit
    //   148: sipush 543
    //   151: invokestatic 83	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   154: aload_2
    //   155: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   6	34	94	java/lang/Exception
    //   6	34	126	finally
    //   95	113	126	finally
    //   57	73	145	finally
    //   146	148	145	finally
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.e.a.2.1
 * JD-Core Version:    0.6.2
 */