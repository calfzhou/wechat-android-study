package com.tencent.kingkong;

public enum CursorJoiner$Result
{
  static
  {
    LEFT = new Result("LEFT", 1);
    BOTH = new Result("BOTH", 2);
    Result[] arrayOfResult = new Result[3];
    arrayOfResult[0] = RIGHT;
    arrayOfResult[1] = LEFT;
    arrayOfResult[2] = BOTH;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.CursorJoiner.Result
 * JD-Core Version:    0.6.2
 */