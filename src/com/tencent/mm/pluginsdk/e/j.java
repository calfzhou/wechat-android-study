package com.tencent.mm.pluginsdk.e;

import android.app.Activity;
import android.widget.Toast;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.z;

public final class j extends b
{
  public j(Activity paramActivity)
  {
    super(paramActivity);
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.i("!56@/B4Tb64lLpLjMA7t73PpEwQVDL1oILW0xdL/Rrb1uqFQ6Jd1LwEHRQ==", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
  }

  public final boolean b(n paramn)
  {
    z.d("!56@/B4Tb64lLpLjMA7t73PpEwQVDL1oILW0xdL/Rrb1uqFQ6Jd1LwEHRQ==", "handleOpenUrl");
    Toast.makeText(this.cHB, paramn.content, 0).show();
    return true;
  }

  public final boolean c(n paramn)
  {
    z.d("!56@/B4Tb64lLpLjMA7t73PpEwQVDL1oILW0xdL/Rrb1uqFQ6Jd1LwEHRQ==", "handleIgnore");
    Toast.makeText(this.cHB, paramn.content, 0).show();
    return true;
  }

  public final boolean d(n paramn)
  {
    z.d("!56@/B4Tb64lLpLjMA7t73PpEwQVDL1oILW0xdL/Rrb1uqFQ6Jd1LwEHRQ==", "handleFalseLast");
    Toast.makeText(this.cHB, paramn.content, 0).show();
    return true;
  }

  public final boolean e(n paramn)
  {
    z.d("!56@/B4Tb64lLpLjMA7t73PpEwQVDL1oILW0xdL/Rrb1uqFQ6Jd1LwEHRQ==", "handleFalseCancel");
    Toast.makeText(this.cHB, paramn.content, 0).show();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.e.j
 * JD-Core Version:    0.6.2
 */