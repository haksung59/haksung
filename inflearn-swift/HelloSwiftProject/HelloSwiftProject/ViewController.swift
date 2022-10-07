//
//  ViewController.swift
//  HelloSwiftProject
//
//  Created by haksung on 2022/07/24.
//

import UIKit

class ViewController: UIViewController {
    
    var p1 = Point(x: 1.0, y: 2.0)
    var p2 = Point(x: 2.0, y: 1.1)
    
    @IBOutlet weak var lbl: UILabel!
    @IBAction func changeLabel(_ sender: UIButton) {
        if sender.currentTitle == "isEqual" {
            if p1 == p2 {
                lbl.text = "Equal"
            }else {
                lbl.text = "Not equal"
            }
        }else {
            let p3 = p1++
            lbl.text = String(format:"%.1f",p3.x) + ", " + String(format:"%.1f",p3.y)
        }
        
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }

}

struct Point {
    var x = 0.0
    var y = 0.0
}

extension Point:Equatable {
    static func ==(lhs:Point, rhs:Point) -> Bool{
        return (lhs.x == rhs.x) && (lhs.y == rhs.y)
    }
}

extension Point {
    static prefix func -(pt:Point) -> Point{
        return Point(x: -pt.x, y: -pt.y)
    }
}

extension Point {
    static postfix func ++(pt: inout Point) -> Point{
        let ret = pt
        pt.x += 1
        pt.y += 1
        return ret
    }
}

extension Point{
    static func +=(lhs: inout Point, rhs: Point) -> Point {
        return Point(x:lhs.x+rhs.x, y:lhs.y+rhs.y)
    }
}
