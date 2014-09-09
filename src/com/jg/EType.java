package com.jg;

public enum EType
{
  static
  {
    ACTIVITYCHECK = new EType("ACTIVITYCHECK", 1);
    PROVIDERCHECK = new EType("PROVIDERCHECK", 2);
    RECEIVERCHECK = new EType("RECEIVERCHECK", 3);
    SERVICESCHECK = new EType("SERVICESCHECK", 4);
    PERMISSIONCHECK = new EType("PERMISSIONCHECK", 5);
    INTENTCHECK = new EType("INTENTCHECK", 6);
    SECURERANDOMCHECK = new EType("SECURERANDOMCHECK", 7);
    JSEXECUTECHECK = new EType("JSEXECUTECHECK", 8);
    HTTPSCHECK = new EType("HTTPSCHECK", 9);
    EType[] arrayOfEType = new EType[10];
    arrayOfEType[0] = ALL;
    arrayOfEType[1] = ACTIVITYCHECK;
    arrayOfEType[2] = PROVIDERCHECK;
    arrayOfEType[3] = RECEIVERCHECK;
    arrayOfEType[4] = SERVICESCHECK;
    arrayOfEType[5] = PERMISSIONCHECK;
    arrayOfEType[6] = INTENTCHECK;
    arrayOfEType[7] = SECURERANDOMCHECK;
    arrayOfEType[8] = JSEXECUTECHECK;
    arrayOfEType[9] = HTTPSCHECK;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.jg.EType
 * JD-Core Version:    0.6.2
 */