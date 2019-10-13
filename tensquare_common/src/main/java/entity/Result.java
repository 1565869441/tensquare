package entity;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @创建者 Administrator
 * @创时间 2019/10/13 19:33
 * @描述
 * @版本 tensquare_parent
 * @更新者 entity
 * @更新时间 2019/10/13
 * @更新描述 TODO
 */
@Data
public class Result {
    private boolean flag;//是否成功
    private Integer code;// 返回码
    private String  message;//返回信息
    private Object  data;// 返回数据

    public Result() {
    }

    public Result(boolean flag, Integer code, String message, Object data) {
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Result(boolean flag, Integer code, String message) {
        this.flag = flag;
        this.code = code;
        this.message = message;
    }
}
