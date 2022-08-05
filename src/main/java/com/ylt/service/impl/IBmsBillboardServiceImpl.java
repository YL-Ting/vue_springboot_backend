package com.ylt.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ylt.mapper.BmsBillboardMapper;
import com.ylt.model.entity.BmsBillboard;
import com.ylt.service.IBmsBillboardService;


/*依賴注入：
 * 依賴注入（dependency injection，縮寫為 DI）是一種軟體設計模式，也是實現控制反轉的其中一種技術。
 * 這種模式能讓一個物件接收它所依賴的其他物件。
 * 「依賴」是指接收方所需的對象。「注入」是指將「依賴」傳遞給接收方的過程。
 * 在「注入」之後，接收方才會調用該「依賴」。
 * 此模式確保了任何想要使用給定服務的物件不需要知道如何建立這些服務（不需要在該物件定義類別時就宣告並實例化所依賴的類別）。
 * 取而代之的是，連接收方物件（像是 client）也不知道它存在的外部代碼（注入器）提供接收方所需的服務。
 * 註：程式語言層次下，「接收方」為對象和 class，「依賴」為變量(傳入的參數)。
 * 在提供服務的角度下，「接收方」為客戶端，「依賴」為服務。 
 */
//ServiceImpl<所要實作的mapper interface,該interface所mapping到的類別>
@Service			
public class IBmsBillboardServiceImpl extends ServiceImpl<BmsBillboardMapper,BmsBillboard>
implements IBmsBillboardService{

}
