package cn.hydralisk.hmsmock.test;

import cn.hydralisk.hmsmock.util.CommonUtils;
import cn.hydralisk.hmsmock.util.PinBlockGenerator;
import cn.hydralisk.hmsmock.util.ThreeDesUtils;

/**
 * 
 * @author master.yang
 * @version $Id: GeneratePinBlock.java, v 0.1 2015-1-8 上午11:37:12 master.yang Exp $
 */
public class GeneratePinBlock {

    public static void main(String[] args) {
        String pinKey = "C5A1EFDE6AD4461B72AF90946EE006AC";
        System.out.println("pin key : " + pinKey);

        String cardNo = "6226168997066875";
        System.out.println("card no : " + cardNo);

        String pin = "111111";
        System.out.println("pin : " + pin);

        byte[] pinBlock = PinBlockGenerator.generate(pin, cardNo);
        System.out.println(CommonUtils.byte2hex(pinBlock));
        
        byte[] pinBlockCipher = ThreeDesUtils.encryptKey(CommonUtils.hex2byte(pinKey), pinBlock);
        
        System.out.println(CommonUtils.byte2hex(pinBlockCipher));
    }
}
