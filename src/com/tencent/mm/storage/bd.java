package com.tencent.mm.storage;

final class bd
{
  public static String[] k(Object[] paramArrayOfObject)
  {
    String[] arrayOfString = new String[paramArrayOfObject.length];
    int i = 0;
    if (i < arrayOfString.length)
    {
      if (!(paramArrayOfObject[i] instanceof String))
        arrayOfString[i] = null;
      while (true)
      {
        i++;
        break;
        arrayOfString[i] = ((String)paramArrayOfObject[i]);
      }
    }
    return arrayOfString;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.bd
 * JD-Core Version:    0.6.2
 */