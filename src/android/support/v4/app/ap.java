package android.support.v4.app;

import android.app.Notification;
import java.util.ArrayList;
import java.util.Iterator;

final class ap
  implements al
{
  public final Notification a(aj paramaj)
  {
    ar localar = new ar(paramaj.mContext, paramaj.cO, paramaj.cy, paramaj.cz, paramaj.cE, paramaj.cC, paramaj.cF, paramaj.cA, paramaj.cB, paramaj.cD, paramaj.cJ, paramaj.cK, paramaj.cM, paramaj.cG, paramaj.mPriority, paramaj.cI);
    Iterator localIterator = paramaj.cN.iterator();
    while (localIterator.hasNext())
    {
      ag localag = (ag)localIterator.next();
      localar.a(localag.icon, localag.title, localag.actionIntent);
    }
    if (paramaj.cH != null)
    {
      if (!(paramaj.cH instanceof ai))
        break label177;
      ai localai = (ai)paramaj.cH;
      localar.a(localai.cR, localai.cT, localai.cS, localai.cx);
    }
    while (true)
    {
      return localar.build();
      label177: if ((paramaj.cH instanceof ak))
      {
        ak localak = (ak)paramaj.cH;
        localar.a(localak.cR, localak.cT, localak.cS, localak.cP);
      }
      else if ((paramaj.cH instanceof ah))
      {
        ah localah = (ah)paramaj.cH;
        localar.a(localah.cR, localah.cT, localah.cS, localah.cu, localah.cv, localah.cw);
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.app.ap
 * JD-Core Version:    0.6.2
 */