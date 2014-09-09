package com.tencent.mm.storage;

class RegionCodeDecoder$DecoderJni
{
  public static native void buildFromFile(String paramString);

  public static native RegionCodeDecoder.Region[] getCities(String paramString1, String paramString2, String paramString3);

  public static native RegionCodeDecoder.Region[] getCountries(String paramString);

  public static native String getLocName(String paramString);

  public static native RegionCodeDecoder.Region[] getProvinces(String paramString1, String paramString2);

  public static native void release();
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.RegionCodeDecoder.DecoderJni
 * JD-Core Version:    0.6.2
 */