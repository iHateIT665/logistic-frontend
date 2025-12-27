package vn.tan;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable; 
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam; 
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime; 
import java.util.ArrayList;     
import java.util.List;          

@Controller
public class WebTestController {

    // ==========================================
    // 1. NHÓM PUBLIC (Trang chủ, Giới thiệu...)
    // ==========================================
    
    @GetMapping("/")
    public String homePage() {
        return "public/home"; 
    }

    @GetMapping("/about")
    public String aboutPage() {
        return "public/about"; 
    }

    // --- KHÁCH VÃNG LAI (PUBLIC) ---
    
    @GetMapping("/request")
    public String showRequestPage() {
        return "public/request"; 
    }

    @PostMapping("/request")
    public String handleRequestSubmit() {
        System.out.println("Đã nhận yêu cầu vận chuyển mới!");
        return "redirect:/?success=true"; 
    }

    // ==========================================
    // 2. NHÓM AUTH (Đăng nhập, Đăng ký)
    // ==========================================

    @GetMapping("/auth/login")
    public String loginPage() {
        return "auth/login"; 
    }

    @GetMapping("/auth/register")
    public String registerPage() {
        return "auth/register"; 
    }
    
    @GetMapping("/auth/forgot-password")
    public String forgotPasswordPage() {
        return "auth/forgot-password"; 
    }
    
    @GetMapping("/auth/verify-otp")
    public String verifyOtpPage() {
        return "auth/verify-otp"; 
    }

    // ==========================================
    // 3. NHÓM USER (Cần đăng nhập - Ví dụ)
    // ==========================================

    @GetMapping("/user/profile")
    public String profilePage() {
        return "user/profile"; 
    }

    @GetMapping("/user/cart")
    public String cartPage() {
        return "user/cart"; 
    }

    // ==========================================
    // 4. NHÓM ADMIN (Quản trị)
    // ==========================================

    @GetMapping("/admin/dashboard")
    public String adminDashboard() {
        return "admin/dashboard"; 
    }
    
    @GetMapping("/admin/users")
    public String adminUserList() {
        return "admin/users"; 
    }
    @GetMapping("/admin/vehicles")
    public String vehicleListPage() {
        return "admin/vehicles"; 
    }
    @GetMapping("/admin/system-config")
    public String systemConfigPage() {
        return "admin/system-config"; 
    }
    
    @PostMapping("/admin/system-config")
    public String saveSystemConfig() {
        System.out.println("Đã lưu cấu hình hệ thống!");
        return "redirect:/admin/system-config?success=true";
    }
    @GetMapping("/admin/audit-log")
    public String auditLogPage() {
        return "admin/audit-log"; 
    }
    
    // --- KHU VỰC MANAGER ---

    @GetMapping("/manager/dashboard")
    public String managerDashboard() {
        return "manager/dashboard"; 
    }
    @GetMapping("/manager/requests")
    public String managerRequestListPage() {
        return "manager/requests"; 
    }
    @GetMapping("/manager/orders")
    public String managerOrderPage() {
        return "manager/orders"; 
    }
    @GetMapping("/manager/planning")
    public String shipmentPlanningPage() {
        return "manager/shipment-planning"; 
    }
    @GetMapping("/manager/locations")
    public String warehousePage() {
        return "manager/locations"; 
    }

    // =========================================================================
    //  KHU VỰC CUSTOMER (USER) - ĐÃ CẬP NHẬT
    // =========================================================================

    @GetMapping("/customer/dashboard")
    public String userDashboard() {
        return "customer/dashboard"; 
    }

    @GetMapping("/customer/create-order")
    public String createOrderPage() {
        return "customer/create-order"; 
    }

    @PostMapping("/customer/create-order")
    public String handleCreateOrder() {
        System.out.println("Khách hàng đã tạo đơn mới!");
        return "redirect:/customer/dashboard?success=create"; 
    }
}