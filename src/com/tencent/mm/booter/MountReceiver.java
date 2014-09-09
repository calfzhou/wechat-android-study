package com.tencent.mm.booter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import android.os.StatFs;
import com.jg.JgClassChecked;
import com.tencent.mm.compatible.g.h;
import com.tencent.mm.model.bg;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.ui.base.en;

@JgClassChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.RECEIVERCHECK})
public class MountReceiver extends BroadcastReceiver
{
  private Context context = null;
  private String diE = "";
  private cm diF = new y(this, Looper.getMainLooper());

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ((paramContext == null) || (paramIntent == null) || (ap.jb(paramIntent.getAction())));
    while (true)
    {
      return;
      if (bg.oE())
      {
        this.context = paramContext;
        this.diE = paramIntent.getAction();
        try
        {
          StatFs localStatFs = new StatFs(h.dOH);
          Object[] arrayOfObject3 = new Object[4];
          arrayOfObject3[0] = h.dOH;
          arrayOfObject3[1] = Integer.valueOf(localStatFs.getBlockSize());
          arrayOfObject3[2] = Integer.valueOf(localStatFs.getBlockCount());
          arrayOfObject3[3] = Integer.valueOf(localStatFs.getAvailableBlocks());
          com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpL+FWZRD8Ro5jXlpJB9munM", "CheckData path[%s] blocksize:%d blockcount:%d availcount:%d", arrayOfObject3);
          Object[] arrayOfObject2 = new Object[2];
          arrayOfObject2[0] = this.diE;
          arrayOfObject2[1] = Boolean.valueOf(bg.oE());
          com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpL+FWZRD8Ro5jXlpJB9munM", "dkmount action:%s hasuin:%b", arrayOfObject2);
          boolean bool = this.diE.equals("android.intent.action.MEDIA_MOUNTED");
          if ((bool) || (this.diE.equals("android.intent.action.MEDIA_EJECT")) || (this.diE.equals("android.intent.action.MEDIA_SHARED")))
          {
            Uri localUri = paramIntent.getData();
            if (localUri != null)
            {
              String str = localUri.getPath();
              if (!h.dOH.equalsIgnoreCase(str))
                break;
            }
            else if (bool)
            {
              bg.qQ().n(new z(this));
              return;
            }
          }
        }
        catch (Exception localException)
        {
          while (true)
          {
            Object[] arrayOfObject1 = new Object[1];
            arrayOfObject1[0] = localException.getMessage();
            com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpL+FWZRD8Ro5jXlpJB9munM", "check data size failed :%s", arrayOfObject1);
          }
          en.cp(paramContext);
          bg.qQ().n(new aa(this));
        }
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.MountReceiver
 * JD-Core Version:    0.6.2
 */