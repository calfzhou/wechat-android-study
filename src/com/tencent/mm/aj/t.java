package com.tencent.mm.aj;

import com.tencent.mm.as.h;
import com.tencent.mm.sdk.f.ai;

public final class t extends ai
{
  public static final String[] dmc = { "CREATE TABLE IF NOT EXISTS verifycontact ( id INTEGER PRIMARY KEY, username varchar(40), nickname varchar(40), fullpy varchar(60), shortpy varchar(40), imgflag int, scene int, content text, status int, reserved1 int,reserved2 int,reserved3 text,reserved4 text)", "CREATE UNIQUE INDEX IF NOT EXISTS verifyContactIndex  ON verifycontact ( username )" };
  private h dmb;

  public t(h paramh)
  {
    this.dmb = paramh;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.t
 * JD-Core Version:    0.6.2
 */